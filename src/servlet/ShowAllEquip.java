package servlet;

import dao.EquipDAO;
import dao.UserDAO;
import entity.Equip;
import entity.User;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

@WebServlet(urlPatterns = "/showEquips")
public class ShowAllEquip extends HttpServlet {
    @EJB
    private EquipDAO dao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        Writer writer = resp.getWriter();
        List<Equip> equips = dao.findAll();

        if (equips == null || equips.isEmpty()){
            writer.write("You have no equips");
        }else {
            for (Equip equip : equips){
                writer.write(equip.toString() + "<br/>");
            }
        }
        writer.close();
    }
}
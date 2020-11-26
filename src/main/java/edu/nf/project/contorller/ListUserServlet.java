package edu.nf.project.contorller;

import com.google.gson.Gson;
import edu.nf.project.dao.Impl.UserDaoImpl;
import edu.nf.project.dao.UserDao;
import edu.nf.project.entity.User;
import edu.nf.project.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list_user")
public class ListUserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService service=new UserService();
        List<User> list=service.listUser();
        list.forEach(u-> System.out.println(u.getuName()));

        String json=new Gson().toJson(list);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(json);
    }
}

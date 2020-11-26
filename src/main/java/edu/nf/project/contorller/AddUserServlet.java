package edu.nf.project.contorller;

import edu.nf.project.entity.User;
import edu.nf.project.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add_user")
public class AddUserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户输入的信息
        String name=req.getParameter("uName");
        String sex=req.getParameter("uSex");
        Integer age=Integer.parseInt( req.getParameter("uAge"));
        String address=req.getParameter("uAddress");
        String email=req.getParameter("uEmail");

       /* System.out.println("用户信息："+name+sex+age+address+email);*/
        User user=new User();
        user.setuName(name);
        user.setuSex(sex);
        user.setuAge(age);
        user.setuAddress(address);
        user.setuEmail(email);

        UserService service=new UserService();
        service.addUser(user);
    }
}

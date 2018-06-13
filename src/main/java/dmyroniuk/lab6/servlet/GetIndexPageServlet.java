package dmyroniuk.lab6.servlet;

import dmyroniuk.lab6.model.Calculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class GetIndexPageServlet extends HttpServlet {

    private final static String index = "/WEB-INF/view/index.jsp";

    private List<Calculator> users;

    @Override
    public void init() throws ServletException {
        users = new CopyOnWriteArrayList<>();
        users.add(new Calculator("plus", 10,1));
        users.add(new Calculator("minus", 20,2));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("users", users);
        req.getRequestDispatcher(index).forward(req, resp);
        users.clear();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF8");
        final String oper1 = req.getParameter("oper1");
        final String oper2 = req.getParameter("oper2");
        final String operation = req.getParameter("operation");
        final Calculator calc = new Calculator(operation, Float.parseFloat(oper1),Float.parseFloat(oper2));

        users.add(calc);

        doGet(req, resp);
    }

}

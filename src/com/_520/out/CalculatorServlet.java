package com._520.out;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置接收数据的编码方式
        req.setCharacterEncoding("UTF-8");
        //设置输出内容类型和输出编码方式
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        String snum1 = req.getParameter("num1");
        String op = req.getParameter("op");
        String snum2 = req.getParameter("num2");
        //System.out.println(snum1 + op + snum2);
        String sum = "";
        if(snum1!=null && snum2!=null){
            int num1 = Integer.valueOf(snum1);
            Integer num2 = Integer.valueOf(snum2);
            switch (op){
                case "+": sum = num1 + num2 + "";
                break;
                case "-": sum = num1 - num2 + "";
                break;
                case "*": sum = num1 * num2 + "";
                break;
                case "/": sum = num1 / num2 + "";
                break;
                default:
                    break;
            }
        }
        out.print("<form action=\"\" method=\"post\">");
        out.print("<input type=\"number\" name=\"num1\" value=" + snum1 + ">");
        out.print("<select name=\"op\">");
        out.print("<option>+</option>");
        out.print("<option>-</option>");
        out.print("<option>*</option>");
        out.print("<option>/</option>");
        out.print("</select>");
        out.print("<input type=\"number\" name=\"num2\" value=" + snum2 + ">");
        out.print("<input type=\"submit\" value=\"=\">");
        out.print("<input type=\"text\" value=" +sum +" disabled>");
        out.print("</form>");
        System.out.println("ddd");
    }
}

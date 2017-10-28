package com.teaminternational.web;

import com.teaminternational.HelloWorldGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyHttpServlet extends BaseHttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HelloWorldGenerator hwg = getBean(HelloWorldGenerator.COMPONENT_NAME);
        PrintWriter pw = resp.getWriter();
        pw.write("<!DOCTYPE html>" +
                "<html lang=\"en\">" +
                "<head>" +
                "<meta charset=\"UTF-8\">" +
                "<title>HelloWorldServlet</title>" +
                "</head>" +
                "<body>");
        pw.write(hwg.sayHello());
        pw.write("</body></html>");
    }
}

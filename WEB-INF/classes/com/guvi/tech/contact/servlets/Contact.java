package com.guvi.tech.contact.servlets;
import com.guvi.tech.contact.dl.*;
import com.guvi.tech.contact.beans.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Contact extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)
{
try
{
ContactBean contactBean;
contactBean=(ContactBean)request.getAttribute("contactBean");
if(contactBean==null)
{
RequestDispatcher requestDispatcher;
requestDispatcher=request.getRequestDispatcher("/ContactForm.jsp");
requestDispatcher.forward(request,response);
return;
}
String name=contactBean.getName();
String address=contactBean.getAddress();
ContactDAO contactDAO=new ContactDAO();
try
{
ContactDTO contact=contactDAO.getByName(name);
if(address.equals(contact.getAddress())==false)
{
ErrorBean errorBean;
errorBean=new ErrorBean();
errorBean.setError("Invalid name/address");
request.setAttribute("errorBean",errorBean);
RequestDispatcher requestDispatcher;
requestDispatcher=request.getRequestDispatcher("/ContactForm.jsp");
requestDispatcher.forward(request,response);
return;
}
HttpSession session=request.getSession();
session.setAttribute("name",name);
RequestDispatcher requestDispatcher;
requestDispatcher=request.getRequestDispatcher("/index.jsp");
requestDispatcher.forward(request,response);
}catch(DAOException daoException)
{
ErrorBean errorBean;
errorBean=new ErrorBean();
errorBean.setError("Invalid name/address");
request.setAttribute("errorBean",errorBean);
RequestDispatcher requestDispatcher;
requestDispatcher=request.getRequestDispatcher("/ContactForm.jsp");
requestDispatcher.forward(request,response);
}
}catch(Exception exception)
{
RequestDispatcher requestDispatcher;
requestDispatcher=request.getRequestDispatcher("/ErrorPage.jsp");
try
{
requestDispatcher.forward(request,response);
}catch(Exception e)
{
//do nothing
}
}
}
}
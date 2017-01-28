import javax.servlet.*;
import java.io.*;
public class First implements Servlet{
//java code
	public First()
	{
		System.out.println("Object Created");
	}
	public void init(ServletConfig config)
	{
		System.out.println("init called");
	}
	public ServletConfig getServiceConfig()
	{
		return null;
	}
	public void service(ServletRequest request,ServletReponse response)throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Welcome...");
		System.out.println("User request.....");
	}
	public String getServletInfo()
	{
		return null;
	}
	public void destroy()
	{
		System.out.println("destroy called");
	}
}
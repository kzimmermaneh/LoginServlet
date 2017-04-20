

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/LoginS3Ex")
public class LoginS3Ex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginS3Ex() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");
        
        
		
		response.getWriter().append("Email" + email).append(request.getContextPath());
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}









      



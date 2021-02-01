package quiztest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QuizIn
 */
public class QuizIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public QuizIn() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String Q_name =request.getParameter("Q2");
		if("b".equals(Q_name)) {
			RequestDispatcher rd=request.getRequestDispatcher("onlineexam.html");
			rd.include(request, response);
		   out.println("correct answer"+"  "+"Hyper Text Markup Langauge"+"   "+"score 1 out of 1");
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("onlineexam.html");
			rd.include(request, response);
			out.println("incorrect answer"+"  "+"correct answer is : "+"Hyper Text Markup Language"+"   "+"score 0 out of 1");
		}
	}

}

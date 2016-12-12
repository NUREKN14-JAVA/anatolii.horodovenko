package com.nixsolution.usermanagment.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vladbel.usermanagment.User;
import com.vladbel.usermanagment.db.DaoFactory;
import com.vladbel.usermanagment.db.DatabaseException;

public class AddServlet extends EditServlet {

	protected void processUser(User user) throws DatabaseException {
        DaoFactory.getInstance().getUserDao().create(user);
    }
	
	protected void showPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/add.jsp").forward(req, resp);
    }
	
}

package com.sleepdeptsearch;

import java.io.IOException;
import javax.servlet.http.*;

import redis.clients.jedis.Jedis;

@SuppressWarnings("serial")
public class Searched extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Leo was here");
		Jedis jedis= JedisMaker.make();
		jedis.set("mykey", "myvalue");
		String value = jedis.get("mykey");
		resp.setContentType("text/plain");
		resp.getWriter().println("Got value: " + value);
	}
}
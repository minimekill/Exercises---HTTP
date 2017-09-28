# Exercises---HTTP






2) The Connection general header controls whether or not the network connection stays open after the current transaction finishes. If the value sent is keep-alive, the connection is persistent and not closed, allowing for subsequent requests to the same server to be done.
		
3)we requested a site and got a redirect code?
4)see program: HttpExercises2  servelets.Leg.java

5)with a get i can see the parameters in the address field. With post they are hidden.
The values are sent in the request body, in the format that the content type specifies, when using the post method.

Program: HttpExercises Web Pages form.html

6)
by setting parameters states between calls can be maintained. This is done by storing a session cookie in temporary memory and is not retained after the browser is closed.
Program: HttpExercises2 servlets.SessionDemo.java 


7) HTTP is a stateless protocol. This means that user data is not persisted from one Web page to the next in a Web site. One way to maintain state is through the use of cookies. Cookies store a set of user specific information, such as a reference identifier for a database record that holds customer information. The Web server embeds the cookie into a user's Web browser so that the user's information becomes available to other pages within the site, users do not have to reenter their information for every page they visit. Cookies are a good way to gather customer information for Web-based shopping, for retaining the personal preferences of the Web user, or for maintaining state about the user.
There are two kinds of cookies, as follows:
In-memory cookies: An in-memory cookie goes away when the user shuts the browser down.
Persistent cookies: A persistent cookie resides on the hard drive of the user and is retrieved when the user comes back to the Web page.
Program: HttpExercises2 servlets CookieDemo.java

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form method="post" modelAttribute="newPlayer"
	action="/addplayer">
	<form:input path="name" type="text" />
	<form:errors path="name" />
	<!-- bind to user.name-->
	<form:input path="level" type="text" />
	<button type="submit" >Send</button>
</form:form>
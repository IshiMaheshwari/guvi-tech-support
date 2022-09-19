<jsp:useBean id='contactBean' scope='request' class='com.guvi.tech.contact.beans.ContactBean'/>
<jsp:setProperty name='contactBean' property='*'/>
<jsp:forward page='/contact'/>
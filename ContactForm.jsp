<jsp:useBean id='errorBean' scope='request' class='com.guvi.tech.contact.beans.ErrorBean'/>
<!DOCTYPE HTML>
<html lang ='en'>
<head>
<title>Application</title>
<link rel='stylesheet' type='text/css' href='/GuviTech/css/styles.css'>
</head>
<body>
<!--Main Container starts here-->
<div class='main-container'>
<!--Header starts here-->
<div class='header'>
<img src = '/GuviTech/images/logo.png' class='logo'>
<div class='brand-name'>
Contact Information</div>
</div><!--Header ends here-->
<!--Content section starts here-->
<div class='content'>
<div class='contactForm'>
<form action='/GuviTech/Contact.jsp' method='post'>
<table border='0'>
<tr>
<td colspan='2' align='center'>
<span class='error'>
${errorBean.error}
</span>
</td>
</tr>
<tr>
<td>Name</td>
<td><input type='text' name='name' id='name' maxlength='15'></td>
</tr>
<tr>
<td>Address</td>
<td><input type='address' name='address' id='address' maxlength='25'></td>
</tr>
<tr>
<td colspan='2' align='center'>
<button type='submit'>Submit</button>
</td>
</tr>
</table>
</form>
</div>
</div><!--Content section ends here-->
</div>
<!--Main Container ends here-->
</body>
</html>
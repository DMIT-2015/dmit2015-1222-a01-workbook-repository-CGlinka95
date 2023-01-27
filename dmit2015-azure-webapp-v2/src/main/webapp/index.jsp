<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

CGlinkaDesigns.com
<img src="/QrCodeImageGeneratorServlet?url=https://cglinkadesigns.com" alt="Christopher Glinka's portfolio website">

<h2>QR Code Generator</h2>
<form method="post" action="/QrCodeImageGeneratorServlet">
    <div>
        <label for="url">URL for QRCode</label>
        <input type="url" id="url" name="url" size="100" />
    </div>
    <div>
        <input type="checkbox" id="download" name="download" />
        <label for="download">Download QRCode Image</label>
    </div>
    <button type="submit">Show me the QRCode</button>
</form>

</body>
</html>
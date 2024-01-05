<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="content" fragment="true"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <!-- Bootstrap 3.4.1 CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <!-- Your custom style.css -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
<div class="macbook-air">
<div class="logo">

  <img src="${pageContext.request.contextPath}/resources/static/cierne_biele.png" style="width: 130px; height: 130px; ">
</div>


    <div class="horne-menu">
      <a href="/"><button class="horny-uvod"><div class="text">Uvod</div></button></a>
      <a href="/about"><button class="horny-about"><div class="text">O klube</div></button></a>
      <a href="/news"><button class="horne-news"><div class="text">Aktuality</div></button></a>
      <a href="/prices"><button class="horny-cennik"><div class="text">Cennik</div></button></a>
      <a href="/reservations"><button class="horne-rezervacie"><div class="text">Rezervacie</div></button></a>
      <a href="/login"><button class="horny-login"><div class="text">Login</div></button></a>
      <a href="/contact"><button class="horny-kontakt"><div class="text">Kontakt</div></button></a>
      <div class="hornyNapisIbeachInfSys">
        <a href="/"> <div class="hornyText-iBeach">iBeach</div></a>
        <a href="/"><div class="hornyText-InfSys">Informacny system Beachclub Presov</div></a>
      </div>
    </div>

  <div class="container">

    <jsp:invoke fragment="content"></jsp:invoke>

  </div>


  <div class="spodne-menu1">
    <div class="spodne-menu2">
      <p class="spodnyText-iBeach">
        <!-- <span class="spodnyText-iBeach2">© 2007-2023 iBeach - all rights reserved</span> -->
      </p>
    </div>

    <!-- <p class="spodni-partneri1"><span class="spodni-partneri2">Partneri</span> <span class="spodni-partneri3">&nbsp;</span></p> -->
    <a href="/"><div class="spodny-uvod">Uvod</div></a>
    <a href="/about"><div class="spodny-about">O klube</div></a>
    <a href="/reservations"><div class="spodne-rezervacie">Rezervacie</div></a>
    <a href="/login"><div class="spodny-login">Login</div></a>
    <a href="/contact"><div class="spodny-kontakt">Kontakt</div></a>
    <a href="/prices"><div class="spodny-cennik">Cennik</div></a>
  </div>
</div>
</body>
</html>

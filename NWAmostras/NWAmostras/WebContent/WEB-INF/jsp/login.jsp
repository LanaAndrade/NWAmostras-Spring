<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <link rel="icon" type="img/png" href="./img/logoNwAmostras.png" />
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script type="text/javascript" src="js/nwAmostrasScript.js" defer></script>

        <script type="text/javascript" src="js/menuResponsivo.js" defer></script>
    </head>
    <body>
        <!--Começo do menu-->
        <header>
            <nav>

                <input type="checkbox" id="check">
                <label for="check" class="checkbtn">
                    <i class="fas fa-bars"></i>
                </label>

                <button class="logo" onclick="location.href='index.html'">
                    <img src="./img/logoNwAmostrasClaro.png" class="imgLogo" id="imgLogoClaro" alt="Logo da NW Amostras">
                    <img src="./img/logoNwAmostrasEscuro.png" class="imgLogo" id="imgLogoEscuro" alt="Logo da NW Amostras">
                </button>

                <ul>
                    <li><button class="buttonMenu" onclick="location.href='#idConhecaNossasFuncionalidades'">Funcionalidades</button></li>
                    <li><button class="buttonMenu" onclick="location.href='artigos.html'">Artigos</button></li>
                    <li><button class="buttonMenu" onclick="location.href='#contato'">Contato</button></li>
                    <li><button class="buttonMenu" onclick="location.href='#'">Login</button></li>
                    <li><button class="buttonMenu" id="btnModoClaroEscuro">
                        <img src="./img/luaModoEscuro.png" class="imgBtnMenuTemaEscuroClaro" id="imgBtnMenuTemaEscuroLua" alt="Troca de temas">
                        <img src="./img/solModoClaro.png" class="imgBtnMenuTemaEscuroClaro" id="imgBtnMenuTemaEscuroSol" alt="Troca de temas">
                    </button></li>
                </ul>
            </nav>
        </header>

        <section>
            <div class="containerTelaLogin">
                <div class="containerInfoLogin">
                
                    <div class="containerTitulosLogin">
                        <button class="buttonLoginCadastro bntLogin" onclick="location.href='login.html'">Login</button>
                        <button class="buttonLoginCadastro" onclick="location.href='cadastro.html'">Cadastre-se</button>
                    </div>
                    <form>
                    <div class="containerEmailSenha">
                        <div class="containerLblsLoginCad"><label class="palavrasAzul lblsLoginCad">E-mail</label></div>
                        <input type="text" class="txtLoginCad" placeholder="Digite seu e-mail"/>
                    </div>
                    <div class="containerEmailSenha">
                        <div class="containerLblsLoginCad"><label class="palavrasAzul lblsLoginCad">Senha</label></div>
                        <input type="text" class="txtLoginCad" placeholder="Digite sua senha"/>
                    </div>
                    <div class="containerEsqueceuSenha">
                        <a class="palavrasAzul lblsLoginCad" href="">Esqueceu sua senha?</a>
                    </div>
                    <div class="containerBtnLogar">
                        <input class="bntLogar" type="submit" value="Logar">
                    </div>
                </form>
                </div>
            </div>
        </section>

        <footer id="contato">
            <label class="tituloContato">CONTATOS</label><br>
            <label class="palavrasAzul fonteDezoitoPx">Instagram: </label><label class="palavrasPreto">@nuwacompany​</label><br>
            <label class="palavrasAzul fonteDezoitoPx">Celular: </label><label class="palavrasPreto">(11) 943118130</label><br>
            <label class="palavrasAzul fonteDezoitoPx">E-mail: </label><label class="palavrasPreto">companynuwa@gmail.com</label><br>
            <label class="palavrasAzul fonteDezoitoPx">Site da empresa: ​</label><a class="palavrasPreto" href="https://nuwa-three.vercel.app/" >https://nuwa-three.vercel.app/</a><br>
        </footer>        

    </body>
</html>
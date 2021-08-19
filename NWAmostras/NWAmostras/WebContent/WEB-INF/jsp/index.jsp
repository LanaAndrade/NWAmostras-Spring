<!DOCTYPE html>
<html>
    <head>
        <title>NW Amostras</title>
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
                    <li><button class="buttonMenu" onclick="location.href='login.html'">Login</button></li>
                    <li><button class="buttonMenu" id="btnModoClaroEscuro">
                        <img src="./img/luaModoEscuro.png" class="imgBtnMenuTemaEscuroClaro" id="imgBtnMenuTemaEscuroLua" alt="Troca de temas">
                        <img src="./img/solModoClaro.png" class="imgBtnMenuTemaEscuroClaro" id="imgBtnMenuTemaEscuroSol" alt="Troca de temas">
                    </button></li>
                </ul>
            </nav>
        </header>

        <!--Inicio do Carrossel-->
            <figure id="carrossel">
                    <div class="img-slider">
                        <div class="slide active">
                            <img src="https://image.freepik.com/fotos-gratis/retrato-de-pesquisadora-em-laboratorio-com-tubo-de-ensaio-e-espaco-de-copia_23-2148816383.jpg" alt="">
                        </div>
                        <div class="slide">
                            <img src="https://image.freepik.com/fotos-gratis/close-up-mao-segurando-o-tubo-do-laboratorio_23-2148794441.jpg" alt="">
                        </div>
                        <div class="slide">
                            <img src="https://image.freepik.com/fotos-gratis/medico-usando-mascara-facial-no-hospital_23-2148728373.jpg" alt="">
                        </div>
                        <div class="slide">
                            <img src="https://image.freepik.com/fotos-gratis/pesquisador-embacado-segurando-objetos-de-vidro_23-2148794433.jpg" alt="">
                        </div>
                        <div class="slide">
                            <img src="https://image.freepik.com/fotos-gratis/retrato-de-pesquisadora-em-laboratorio-com-tubo-de-ensaio-e-espaco-de-copia_23-2148816383.jpg" alt="">
                        </div>
                        <div class="navigation">
                            <div class="btn active"></div>
                            <div class="btn"></div>
                            <div class="btn"></div>
                            <div class="btn"></div>
                            <div class="btn"></div>
                        </div>
                    </div>
          
                <body onload="carrossel()">
            </figure> 
        <!--Fim do Carrossel-->

        <div class="nwAmostrasIntroducao">
            <label class="tituloNwAmostras">NW AMOSTRAS</label><br>
            <div class="decoracaoTitulos"></div>
            <div class="divTxtNwAmostras">
            <Label class="txtNwAmostras">
                O sistema NW Amostras auxilia instituições científicas na organização e monitoramento de dados, apoiando os técnicos biomédicos em seus laboratórios tornando sua pesquisa mais simples de ser efetuada.
                <br>
                O programa traz isso de uma forma moderna, prática, intuitiva e de fácil acesso para que os pesquisadores de todas as idades possam utilizar sem grandes dificuldades. 
            </Label>
            </div>
        </div>

        <!--Inicio das Funcionalidades-->
        <div class="conhecaNossasFuncionalidades" id="idConhecaNossasFuncionalidades">
            <label class="tituloNwAmostras">CONHEÇA NOSSAS FUNCIONALIDADES</label><br>
            <div class="decoracaoTitulos"></div>

            <div class="containerImagemTxts">
                <div class="imgFuncionalidades">
                    <img src="./img/imgCriarProjetos.png" alt="">
                </div>

                <div class="txtFuncionalidades">
                    <div class="containerTituloTxtFuncionalidades">
                        <div class="divTitulosFuncionalidades"><label class="tituloFuncionalidadesIndex palavrasAzul">CRIA PROJETOS</label></div><br>
                        <label class="txtFuncionalidadesIndex">A criação dos projetos facilita a dncfwiuhfr8iw jnwf8cjre9ifjcw uwhf8jf9ewjfienf dushncdfuesheisn shd9e8jf98redhif.​​</label>
                    </div>
                </div>

                <div class="imgFuncionalidades mudancaPosicaoImgUmIndex">
                    <img src="./img/imgCriarMapaAmostraIndex.png" alt="">
                </div>

                <div class="txtFuncionalidades">
                    <div class="containerTituloTxtFuncionalidades">
                        <div class="divTitulosFuncionalidades"><label class="tituloFuncionalidadesIndex palavrasAzul">CRIA MAPA DE AMOSTRAS</label></div><br>
                        <label class="txtFuncionalidadesIndex">A criação dos mapas de amostras facilita a dncfwiuhfr8iw jnwf8cjre9ifjcw uwhf8jf9ewjfienf dushncdfuesheisn shd9e8jf98redhif.​​​​</label>
                    </div>
                </div>

                <div class="imgFuncionalidades mudancaPosicaoImgDoisIndex">
                    <img src="./img/imgCriarMapaAmostraIndex.png" alt="">
                </div>

                <div class="imgFuncionalidades">
                    <img src="./img/imgCriarArtigosIndex.png" alt="">
                </div>

                <div class="txtFuncionalidades">
                    <div class="containerTituloTxtFuncionalidades">
                        <div class="divTitulosFuncionalidades"><label class="tituloFuncionalidadesIndex palavrasAzul">CRIA ARTIGOS</label></div><br>
                        <label class="txtFuncionalidadesIndex">A criação dos artigos facilita a dncfwiuhfr8iw jnwf8cjre9ifjcw uwhf8jf9ewjfienf dushncdfuesheisn shd9e8jf98redhif.​​​​​​​​</label>
                    </div>
                </div>
            </div>
        </div>
        <!--Fim das Funcionalidades-->

        <!--Começo Artigos-->
        <div class="containerArtigoIndex" id="idContainerArtigoIndex">
            <label class="tituloNwAmostras">ARTIGOS</label><br>
            <div class="decoracaoTitulos"></div>

            <div class="containerPesquisaFiltro">
                <button class="buttonPesquisarArtigo" onclick="location.href='#'">
                    <img src="./img/lupa.png" class="imgLupa" alt="">
                </button>
                
                <input type="text" class="inputBuscarArtigoIndex" placeholder="Buscar Artigos"/>

                <button class="buttonFiltrarArtigo" onclick="location.href='#'">
                    <img src="./img/filtro.png" class="imgFiltro" alt="">
                </button>
            </div>

            <div class="containerPrincipaisArtigosIndex">
                <div class="principaisArtigosIndex">
                    <div class="containerImgInfoArtigo">
                        <img src="./img/imgExemploArtigo.png" class="imgArtigoIndex" alt="">
                        <label class="palavrasAzul fonteDezoitoPx lblArtigosIndex">Nome do Projeto exemplo em modelo super mega extra grande...</label><br>
                        <label class="palavrasAzul fonteDezoitoPx lblArtigosIndex">Autor: </label><label class="palavrasPreto lblArtigosIndex">Exemplo 1, Exemplo 2, Exemplo 3</label><br>
                        <label class="palavrasAzul fonteDezoitoPx lblArtigosIndex">Data de publicação: </label><label class="palavrasPreto lblArtigosIndex">00/00/0000</label><br>
                        <label class="palavrasAzul fonteDezoitoPx lblArtigosIndex">Palavras-chaves: </label><label class="palavrasPreto lblArtigosIndex">exemplo a, exemplo b, exemplo c,  exemplo d</label>
                    </div>
                    <div class="containerResumoArtigoIndex">
                        <label class="palavrasAzul fonteDezoitoPx lblArtigosIndex">Resumo: </label><label class="palavrasPreto lblArtigosIndex">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</label>
                    </div>
                </div>
                <div class="principaisArtigosIndex">
                    <div class="containerImgInfoArtigo">
                        <img src="./img/imgExemploArtigo.png" class="imgArtigoIndex" alt="">
                        <label class="palavrasAzul fonteDezoitoPx lblArtigosIndex">Nome do Projeto exemplo em modelo super mega extra grande...</label><br>
                        <label class="palavrasAzul fonteDezoitoPx lblArtigosIndex">Autor: </label><label class="palavrasPreto lblArtigosIndex">Exemplo 1, Exemplo 2, Exemplo 3</label><br>
                        <label class="palavrasAzul fonteDezoitoPx lblArtigosIndex">Data de publicação: </label><label class="palavrasPreto lblArtigosIndex">00/00/0000</label><br>
                        <label class="palavrasAzul fonteDezoitoPx lblArtigosIndex">Palavras-chaves: </label><label class="palavrasPreto lblArtigosIndex">exemplo a, exemplo b, exemplo c,  exemplo d</label>
                    </div>
                    <div class="containerResumoArtigoIndex">
                        <label class="palavrasAzul fonteDezoitoPx lblArtigosIndex">Resumo: </label><label class="palavrasPreto lblArtigosIndex">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</label>
                    </div>
                </div>
            </div>
        </div>
        <!--Fim Artigos-->

        <footer id="contato">
            <label class="tituloContato">CONTATOS</label><br>
            <label class="palavrasAzul fonteDezoitoPx">Instagram: </label><label class="palavrasPreto">@nuwacompany​</label><br>
            <label class="palavrasAzul fonteDezoitoPx">Celular: </label><label class="palavrasPreto">(11) 943118130</label><br>
            <label class="palavrasAzul fonteDezoitoPx">E-mail: </label><label class="palavrasPreto">companynuwa@gmail.com</label><br>
            <label class="palavrasAzul fonteDezoitoPx">Site da empresa: ​</label><a class="palavrasPreto" href="https://nuwa-three.vercel.app/" >https://nuwa-three.vercel.app/</a><br>
        </footer>        

    </body>
</html>
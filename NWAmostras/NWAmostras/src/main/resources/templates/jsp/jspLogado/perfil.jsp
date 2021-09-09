<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Meu Perfil</title>

<link rel="icon" type="img/png" href="../../img/logoNwAmostras.png" />
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" type="text/css" href="../../css/style.css" />
<script type="text/javascript" src="../../js/nwAmostrasScript.js" defer></script>

<script type="text/javascript" src="../../js/menuResponsivo.js" defer></script>

</head>
<body>

	<%@ include file="../../includes/menuLogado.jsp" %>
	
	<div class="containerMeuPerfil">
		<div class="containerGeralMinhaConta">
			<div class="containerGeralPerfil"><label class="lblMeuPerfilGeral">Geral</label></div>
			<div class="containerMinhaConta">
				<div class="conatinerImagemMeuPerfil">
					<img src="../../img/imgPerfilExemplo.png" class="imagemMeuPerfil" id="" alt="Perfil">
				</div>
				<div class="containerBtnAlterarFoto">
					<button class="btnAlterarFoto" onclick="location.href=''">
					<img src="../../img/imgAlterarFoto.png" class="imgAlterarFoto" id="" alt="Alterar Foto">Alterar Foto</button>
				</div>
				<div class="containerNomeMeuPerfil">
					<label class="lblNomeMeuPerfil">Josefina Bund Fin</label>
				</div>
				<div class="containerMinhaContaTitulo">
					<label class="lblMinhaContaTitulo">Minha Conta</label>
				</div>
			</div>
		</div>
		
		<div class="containersInformacoesMeuPerfil">
			<div class="containerLinksMeuPerfil"><a href="editarPerfil.jsp" class="linksMeuPerfil palavrasAzul" >Editar Perfil</a></div>
			<div class="containerTxtsInformacoesMeuPerfil">
				<div class="containerLblsTituloInformacoesMeuPerfil"><label class="lblsTituloInformacoesMeuPerfil palavrasAzul">Nome</label></div>
				<input type="text" class="txtsInformacoesMeuPerfil" disabled="disabled" value="Josefina Bund Fin"/>
			</div>
		</div>
		<div class="containersInformacoesMeuPerfil">
			<div class="containerLinksMeuPerfil"><a href="" class="linksMeuPerfil palavrasAzul" >Sobre a empresa</a></div>
			<div class="containerTxtsInformacoesMeuPerfil">
				<div class="containerLblsTituloInformacoesMeuPerfil"><label class="lblsTituloInformacoesMeuPerfil palavrasAzul">CPF</label></div>
				<input type="text" class="txtsInformacoesMeuPerfil" disabled="disabled" value="000.000.000-00"/>
			</div>
		</div>
		<div class="containersInformacoesMeuPerfil">
			<div class="containerLinksMeuPerfil"><a href="" class="linksMeuPerfil palavrasAzul" >Sugest�o</a></div>
			<div class="containerTxtsInformacoesMeuPerfil">
				<div class="containerLblsTituloInformacoesMeuPerfil"><label class="lblsTituloInformacoesMeuPerfil palavrasAzul">E-mail</label></div>
				<input type="text" class="txtsInformacoesMeuPerfil" disabled="disabled" value="josefinabundfin@gmail.com"/>
			</div>
		</div>
		<div class="containersInformacoesMeuPerfil">
			<div class="containerLinksMeuPerfil"><a href="" class="linksMeuPerfil palavrasAzul" >Desativar  conta</a></div>
			<div class="containerTxtsInformacoesMeuPerfil">
				<div class="containerLblsTituloInformacoesMeuPerfil"><label class="lblsTituloInformacoesMeuPerfil palavrasAzul">Senha</label></div>
				<input type="text" class="txtsInformacoesMeuPerfil" disabled="disabled" value="******"/>
			</div>
		</div>
		<div class="containersInformacoesMeuPerfil">
			<div class="containerLinksMeuPerfil"><a href="" class="linksMeuPerfil linkDeslogar" >Sair</a></div>
			<div class="containerTxtsInformacoesMeuPerfil">
				<a href="" class="linkCriarInstituicaoMeuPerfil palavrasAzul">Criar institui��o</a>
			</div>
		</div>
		
		<div class="containerLinksModoCelular">
			<div class="containerGeralPerfil containerGeralPerfilModoCelular"><label class="lblMeuPerfilGeral">Geral</label></div>
			<div class="containerLinksMeuPerfil containerLinksMeuPerfilModoCelular"><a href="editarPerfil.jsp" class="linksMeuPerfil palavrasAzul" >Editar Perfil</a></div>
			<div class="containerLinksMeuPerfil containerLinksMeuPerfilModoCelular"><a href="" class="linksMeuPerfil palavrasAzul" >Sobre a empresa</a></div>
			<div class="containerLinksMeuPerfil containerLinksMeuPerfilModoCelular"><a href="" class="linksMeuPerfil palavrasAzul" >Sugest�o</a></div>
			<div class="containerLinksMeuPerfil containerLinksMeuPerfilModoCelular"><a href="" class="linksMeuPerfil palavrasAzul" >Desativar  conta</a></div>
			<div class="containerLinksMeuPerfil containerLinksMeuPerfilModoCelular"><a href="" class="linksMeuPerfil linkDeslogar" >Sair</a></div>
		</div>
	</div>

</body>
</html>
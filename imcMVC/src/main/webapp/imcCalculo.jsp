<!DOCTYPE html>
<html lang="pt-br">
<head>
    <title>Calculo IMC com padrao MVC</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>

<body>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-4">
		</div>
		<div class="col-md-4">

		    <h1 style= margin-top:5%> Calculo de imc com padrao MVC </h1>

			<form role="form" style= margin-top:10%>
				<div class="form-group">

					<label for="AlturaInput">
						Altura:
					</label>
					<input type="text" class="form-control" id="AlturaInput" name="txtaltura"/>
				</div>
				<div class="form-group">

					<label for="PesoInput">
						Peso:
					</label>
					<input type="text" class="form-control" id="PesoInput" name="txtpeso"/>
				</div>
				<button type="submit" class="btn btn-primary">
					Calcular
				</button>
			</form>
			<h2 class="text-center" style= margin-top:15%>
            ${resultado}
			</h2>
		</div>
		<div class="col-md-4">
		</div>
	</div>
</div>

</body>
</html>
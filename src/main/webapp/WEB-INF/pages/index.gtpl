<html>
	<head>
		<link rel="stylesheet" type="text/css" href="/css/h5bp.css">
		<link rel="stylesheet" type="text/css" href="/css/default.css">
		<style>
			body {
				background-color: #bbb;
				color: #ff6633;
			}
			.header {
				position:relative;
				height: 170px;
			}
			h1 {
				position:absolute;
				font-size: 200px;
				line-height: .83;
				margin: 0;
				top: 20px;
				left: 65px;
			}
			div.name {
				color: #fff;
				position:absolute;
				top: 27px;
				left: 350px;
				font-size: 90px;
				line-height: .85;
			}
			div.warning {
				font-size: 60px;
				text-align: center;
				margin: 40px 70px;
				padding: 15px;
				border: 5px solid #ee2222;
				background-color: #eec0bb;
				color: #ee2222;
				border-radius: 10px;
			}
			.interest {
				font-size: 30px;
				color: #fff;
				
				margin: 0 120px;
			}
			.interest a {
				color: #fff;
				text-decoration: none;
				border-bottom: 3px dotted #fff;
			}
		</style>
	</head>
	<body>
		<div class="main">
			<div class="header">
				<h1>Hi!</h1>
				<div class="name">
					I'm Alex
					Weingarten
				</div>
			</div>
			<div class="warning">
				And I'm looking for a job!
			</div>
			<div class="interest">
				If you've got one, check out my <a href="/resume">resume</a>.  And be sure to check back.
				Now that I have time, I'll be updating this site periodically.
			</div>
		</div>
		
		<% include '/WEB-INF/includes/footer.gtpl' %>
	</body>
</html>
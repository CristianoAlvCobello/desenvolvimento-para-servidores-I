<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Exercícios PHP - Desenvolvimento para Servidores</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #dfe9f3, #ffffff);
        margin: 0;
        padding: 20px;
        color: #333;
    }
    header {
        text-align: center;
        background-color: #0056d2;
        color: white;
        padding: 25px;
        border-radius: 12px;
        box-shadow: 0 4px 8px rgba(0,0,0,0.2);
        margin-bottom: 30px;
    }
    header h1 {
        margin: 0;
        font-size: 28px;
        letter-spacing: 1px;
    }
    header h2 {
        margin: 5px 0 0;
        font-size: 18px;
        font-weight: 400;
    }
    .card {
        background-color: #fff;
        border-radius: 12px;
        box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        padding: 20px 25px;
        margin: 20px auto;
        width: 80%;
        transition: transform 0.2s ease, box-shadow 0.2s ease;
    }
    .card:hover {
        transform: scale(1.02);
        box-shadow: 0 4px 16px rgba(0,0,0,0.15);
    }
    h3 {
        color: #0056d2;
        border-left: 6px solid #0056d2;
        padding-left: 10px;
        font-size: 20px;
    }
    strong {
        color: #111;
    }
    span.aprovado {
        color: #28a745;
        font-weight: bold;
    }
    span.reprovado {
        color: #dc3545;
        font-weight: bold;
    }
    ul {
        list-style: none;
        padding: 0;
    }
    ul li {
        margin-bottom: 4px;
    }
</style>
</head>
<body>

<header>
    <h1>Exercícios PHP - Desenvolvimento para Servidores</h1>
    <h2>Aluno: Cristiano Alves Cobello</h2>
</header>

<div class="card">
<?php
echo "<h3>1. Preço da roupa</h3>";

$peca = "Camiseta";
$tamanho = "G";
$preco = 0;

switch ($peca) {
    case "Camiseta": $preco = 50; break;
    case "Calça": $preco = 80; break;
    case "Jaqueta": $preco = 120; break;
    default: $preco = 40; break;
}

if ($tamanho == "G") {
    $preco *= 1.10;
}

echo "A peça <strong>$peca</strong> de tamanho <strong>$tamanho</strong> custa <strong>R$ " . number_format($preco, 2, ',', '.') . "</strong>.";
?>
</div>

<div class="card">
<?php
echo "<h3>2. Média de notas</h3>";

$alunos = [
    "Ana" => [8, 7, 9, 6],
    "Bruno" => [5, 4, 6, 5],
    "Carla" => [9, 8, 10, 9]
];

foreach ($alunos as $nome => $notas) {
    $media = array_sum($notas) / count($notas);
    echo "$nome - Média: <strong>" . number_format($media, 1) . "</strong> - ";
    echo $media >= 6 ? "<span class='aprovado'>Aprovado</span><br>" : "<span class='reprovado'>Reprovado</span><br>";
}
?>
</div>

<div class="card">
<?php
echo "<h3>3. Números pares entre 1 e 50</h3>";

$pares = [];
$soma = 0;
$contador = 1;

while ($contador <= 50) {
    if ($contador % 2 == 0) {
        $pares[] = $contador;
        $soma += $contador;
    }
    $contador++;
}

echo "Números pares: " . implode(", ", $pares) . "<br>";
echo "Soma total: <strong>$soma</strong>";
?>
</div>

<div class="card">
<?php
echo "<h3>4. Caixa eletrônico</h3>";

$valor = 100;
$nota = 0;

switch ($valor) {
    case 20: $nota = 20; break;
    case 50: $nota = 50; break;
    case 100: $nota = 100; break;
    default: echo "Valor inválido!<br>"; break;
}

$total = $valor;
$contador = 0;

while ($total >= $nota && $nota > 0) {
    $total -= $nota;
    $contador++;
}

if ($nota > 0) {
    echo "Saque de R$ $valor realizado com <strong>$contador</strong> nota(s) de R$ $nota.";
}
?>
</div>

<div class="card">
<?php
echo "<h3>5. Carrinho de compras</h3>";

$carrinho = [
    ["produto" => "Mouse", "preco" => 50],
    ["produto" => "Teclado", "preco" => 120],
    ["produto" => "Headset", "preco" => 200]
];

$total = 0;
echo "<ul>";

foreach ($carrinho as $item) {
    echo "<li>" . $item["produto"] . " - R$ " . number_format($item["preco"], 2, ',', '.') . "</li>";
    $total += $item["preco"];
}

echo "</ul>";
echo "<strong>Total: R$ " . number_format($total, 2, ',', '.') . "</strong>";
?>
</div>

<div class="card">
<?php
echo "<h3>6. Aumento salarial</h3>";

$salarios = [1800, 2200, 1500, 3000, 1900];

foreach ($salarios as $indice => $salario) {
    if ($salario < 2000) {
        $salarios[$indice] = $salario * 1.10;
    }
}

echo "<ul>";
foreach ($salarios as $valor) {
    echo "<li>R$ " . number_format($valor, 2, ',', '.') . "</li>";
}
echo "</ul>";
?>
</div>

</body>
</html>

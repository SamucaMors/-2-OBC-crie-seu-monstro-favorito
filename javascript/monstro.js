const nomeMonstro = prompt("Digite o nome do monstro: ");
const tipoMonstro = prompt("Digite o tipo do monstro: ");
const nivelForca = parseInt(prompt("Digite o nível de força do monstro (1 a 100): "));
const habilidadeEspecial = prompt("Digite a habilidade especial do monstro: ");

console.log(`O monstro ${nomeMonstro} é um ${tipoMonstro} de nível ${nivelForca} e possui a habilidade especial: ${habilidadeEspecial}.`);

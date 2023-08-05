const input = `
3
     ROMEO      AND
      JULIET WERE  
        IN LOVE    
4
WHO
ELSE
LOVES
STAIRS
3
A TEXT CAN BE JUSTIFIED
ON   BOTH   SIDES    OR
JUST   TO   THE   RIGHT
0
`.trim();
const lines = input.split("\n");

while (true) {
  const numero = Number(lines.shift());
  if (numero === 0) break;
  const texto = Array.from({ length: numero }).map((_, i), function () {
    return lines.shift();
  });
}

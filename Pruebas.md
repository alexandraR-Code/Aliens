# Comparación de pruebas: Manual vs IA

## Contexto proporcionado a la IA
"La clase Aliens tiene un constructor que recibe tamanio y color. Si el tamaño es menor a 5, se ajusta a 5. Si es mayor a 30, se ajusta a 30. Si está entre 5 y 30, se queda igual. Además, el constructor calcula tres precios a partir del tamaño ya ajustado: precioCuerpo es el 20% del tamaño, precioExtremidad es el 10% del tamaño, y precioOjo es el 5% del tamaño."

## Casos de prueba
AliensJUint (manual) tiene 5 pruebas, mientras que la generada por IA tiene 10 — el doble.

## Cobertura
La IA cubrió los casos límite (tamaño exactamente en 5 y exactamente en 30) y también probó la corrección del máximo (100 → 30), algo que la clase manual no había probado (solo se cubrió la corrección del mínimo). También agregó un caso combinado, verificando que los 3 precios se calculan con el tamaño ya ajustado en un mismo test.

## Calidad
Los nombres de los métodos de la IA (tamanioMenorAlMinimoSeAjustaA5, colorSeAsignaCorrectamente) son mucho más descriptivos que los de la clase manual (miPrimeraPueba, miSegundaPrueba) — con solo leer el nombre, se entiende exactamente qué se está probando, sin necesidad de abrir el código.

## Conclusión
La generación de pruebas con IA resulta con mayor perspectiva de todos los casos de prueba que se pueden llevar a cabo, sin dejar de probar cualquier circunstancia.
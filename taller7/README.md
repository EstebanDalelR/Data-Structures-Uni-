1. En los casos en los que se dan demasiadas colisiones, cada sondeo hasta encontrar un espacio diponible toma más tiempo, 
además que la tabla requiere un crecimiento más temprano que en el Encadenamiento separado.
2. Sí. Si dentro de cada casilla del la tabla se pone un árbol la complejidad se reduce. Ahora bien, el diccionario tendría
que tener parámetros muy claros de ordenamiento para hacerlo un árbol. Las llaves han de ser ordenadas, pero las colisiones 
harían que se perdiera información ya que el árbol cambia el valor de la misma llave. Por otro lado, el espacio en memoria
sería ridículo. No es práctico.

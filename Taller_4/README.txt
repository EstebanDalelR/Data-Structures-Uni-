2.cuando se escoge el elmento de más a la izquierda, el algoritmo genera el peor caso para un input ya ordenado. Esto se 
resuelve desordenando el arreglo, o escogiendo un índice al azar. Según Sedgewick, es mejor usar la meduana del primer,
último y elemento de la mitad como índice. 
Otro problema es que si los datos de los extremos son muy distantes, se podría dar un integer overflow.
1.
Para un arreglo ordenado:
Bubble sort queda primero ya que es adaptativo y en el mejor caso es N.
Merge sort queda segundo, ya que en todo caso es NlogN.
Quicksort, por el problema del pivote, podría llegar a ser N2.
Para un arrelo con todos iguales:
Bubble sort vuelve a ganar porque es N.
Merge sort y quicksort empatan por ser NlogN
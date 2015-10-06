1. Las inserciones son muy demoradas. En el mejor caso es 1, si siempre llegan pacientes de alta prioridad, pero en 
un día tranquilo hay que recorrer toda la lista para insertar nuevos nodos.
2. Una tabla de Hash sería lo mejor, pero como no es una opción, le sigue un árbol, en este caso, un Heap, ya que 
para todo caso, su tiempo es Log N. Para muchas eliminaciones (en este caso atención a pacientes), lo mejor será 
una lista ordenda.
3. Que el nodo conectado a CentralPacientes no sea el primero sino el último, y la lista esté de menor a mayor.
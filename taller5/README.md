1. Las inserciones son muy demoradas. En el mejor caso es 1, si siempre llegan pacientes de alta prioridad, pero en 
un d�a tranquilo hay que recorrer toda la lista para insertar nuevos nodos.
2. Una tabla de Hash ser�a lo mejor, pero como no es una opci�n, le sigue un �rbol, en este caso, un Heap, ya que 
para todo caso, su tiempo es Log N. Para muchas eliminaciones (en este caso atenci�n a pacientes), lo mejor ser� 
una lista ordenda.
3. Que el nodo conectado a CentralPacientes no sea el primero sino el �ltimo, y la lista est� de menor a mayor.
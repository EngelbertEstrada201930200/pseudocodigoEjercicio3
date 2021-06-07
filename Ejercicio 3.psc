Algoritmo factorial
	Definir n,x, fac Como Entero
	
	Escribir "Ingese un numero"
	Leer n
	
	Si n>0 Entonces
		x=1
		fac =1
		Mientras x<=n Hacer
			fac = fac*x
			x=x+1
		Fin Mientras
		Escribir "El factorial es " fac
	SiNo
		Escribir "No se puede carlcular el factorial"
	Fin Si
	
FinAlgoritmo

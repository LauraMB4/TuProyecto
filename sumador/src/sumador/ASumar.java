package sumador;

// TODO: Auto-generated Javadoc
/**
 * The Class ASumar.
 */
public class ASumar {

	/**
	 * Mostrar.
	 *
	 * @param string con la cifra 
	 * @return string = ella misma por ser de una cifra. En caso de ser negativa devuelve una cadena vacía.
	 */
	public String mostrar(String string) {
		// TODO Auto-generated method stub
		if (string.charAt(0)=='-')
			return ("");

		return (string + " = " + string);
	}

}

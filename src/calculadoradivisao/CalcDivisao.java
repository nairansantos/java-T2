package calculadoradivisao;

public class CalcDivisao {

	    public static int somar(int x, int y) {
	        return x + y;
	    }

	    public static int subtrair(int x, int y) {
	        return  x- y;
	    }

	    public static int multiplicar(int x, int y) {
	        return x * y;
	    }

	    public static int dividir(int dividendo, int divisor) throws DivisionByZeroException {
	        if (divisor == 0) {
	            throw new DivisionByZeroException("Divisão por zero não é permitida.");
	        }
	        return dividendo / divisor;
	    }

	    public static float dividir(float dividendo, float divisor) throws DivisionByZeroException {
	        if (divisor == 0.0f) {
	            throw new DivisionByZeroException("Divisão por zero não é permitido.");
	        }
	        return dividendo / divisor;
	    }

	    public static void main(String[] args) {
	        try {
	            int resultadoDivisaoInt = dividir(12, 2);
	            System.out.println("Resultado da Divisão de Inteiros: " + resultadoDivisaoInt);

	            float resultadoDivisaoFloat = dividir(12.0f, 0.0f);
	            System.out.println("Resultado da Divisão de Floats: " + resultadoDivisaoFloat);
	        } catch (DivisionByZeroException e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	    }
	}

	class DivisionByZeroException extends Exception {
	    private static final long serialVersionUID = 1L;

		public DivisionByZeroException(String message) {
	        super(message);
	    }
}


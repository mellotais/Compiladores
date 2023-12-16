package CompiladorCompleto;

public interface ParserConstants
{
    int FIRST_SEMANTIC_ACTION = 66;

    int SHIFT  = 0;
    int REDUCE = 1;
    int ACTION = 2;
    int ACCEPT = 3;
    int GO_TO  = 4;
    int ERROR  = 5;

    //int[][][] PARSER_TABLE =
    int[][][] PARSER_TABLE = new t().tabela;
    
    public class t	{
    		int SHIFT  = 0;
    		int REDUCE = 1;
    		int ACTION = 2;
    		int ACCEPT = 3;
    		int GO_TO  = 4;
    		int ERROR  = 5;
    		
    int tabela[][][] = new int[123][66][2];
    
    	public class ca0{				int a0[][] = { {ERROR ,   0}, {SHIFT ,   2}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,   1}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	}
    	
    	public class ca1{				int a1[][] = { {ACCEPT,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca2{				int a2[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,   3}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca3{				int a3[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,   4}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca4{				int a4[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,   5}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca5{				int a5[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,   7}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,   6}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca6{				int a6[][] = { {REDUCE,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca7{				int a7[][] = { {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  32}, {SHIFT ,  28}, {SHIFT ,  31}, {SHIFT ,  21}, {SHIFT ,  26}, {REDUCE,  10}, {SHIFT ,  23}, {REDUCE,  10}, {SHIFT ,  22}, {SHIFT ,  27}, {SHIFT ,  20}, {ERROR ,   0}, {SHIFT ,  25}, {ERROR ,   0}, {SHIFT ,  30}, {SHIFT ,  29}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  10}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,   8}, {GO_TO ,   9}, {ERROR ,   0}, {GO_TO ,  19}, {GO_TO ,  10}, {GO_TO ,  17}, {GO_TO ,  18}, {ERROR ,   0}, {GO_TO ,  11}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  12}, {ERROR ,   0}, {GO_TO ,  13}, {GO_TO ,  15}, {ERROR ,   0}, {GO_TO ,  16}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  14}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  24}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca8{				int a8[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  33}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca9{				int a9[][] = { {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  32}, {SHIFT ,  28}, {SHIFT ,  31}, {SHIFT ,  21}, {SHIFT ,  26}, {REDUCE,  10}, {SHIFT ,  23}, {REDUCE,  10}, {SHIFT ,  22}, {SHIFT ,  27}, {SHIFT ,  20}, {ERROR ,   0}, {SHIFT ,  25}, {ERROR ,   0}, {SHIFT ,  30}, {SHIFT ,  29}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  10}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  34}, {GO_TO ,   9}, {ERROR ,   0}, {GO_TO ,  19}, {GO_TO ,  10}, {GO_TO ,  17}, {GO_TO ,  18}, {ERROR ,   0}, {GO_TO ,  11}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  12}, {ERROR ,   0}, {GO_TO ,  13}, {GO_TO ,  15}, {ERROR ,   0}, {GO_TO ,  16}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  14}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  24}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca10{				int a10[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  11}, {REDUCE,  11}, {REDUCE,  11}, {REDUCE,  11}, {REDUCE,  11}, {REDUCE,  11}, {REDUCE,  11}, {REDUCE,  11}, {REDUCE,  11}, {REDUCE,  11}, {REDUCE,  11}, {ERROR ,   0}, {REDUCE,  11}, {ERROR ,   0}, {REDUCE,  11}, {REDUCE,  11}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  11}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca11{				int a11[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  12}, {REDUCE,  12}, {REDUCE,  12}, {REDUCE,  12}, {REDUCE,  12}, {REDUCE,  12}, {REDUCE,  12}, {REDUCE,  12}, {REDUCE,  12}, {REDUCE,  12}, {REDUCE,  12}, {ERROR ,   0}, {REDUCE,  12}, {ERROR ,   0}, {REDUCE,  12}, {REDUCE,  12}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  12}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca12{				int a12[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  13}, {REDUCE,  13}, {REDUCE,  13}, {REDUCE,  13}, {REDUCE,  13}, {REDUCE,  13}, {REDUCE,  13}, {REDUCE,  13}, {REDUCE,  13}, {REDUCE,  13}, {REDUCE,  13}, {ERROR ,   0}, {REDUCE,  13}, {ERROR ,   0}, {REDUCE,  13}, {REDUCE,  13}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  13}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca13{				int a13[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  14}, {REDUCE,  14}, {REDUCE,  14}, {REDUCE,  14}, {REDUCE,  14}, {REDUCE,  14}, {REDUCE,  14}, {REDUCE,  14}, {REDUCE,  14}, {REDUCE,  14}, {REDUCE,  14}, {ERROR ,   0}, {REDUCE,  14}, {ERROR ,   0}, {REDUCE,  14}, {REDUCE,  14}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  14}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca14{				int a14[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  15}, {REDUCE,  15}, {REDUCE,  15}, {REDUCE,  15}, {REDUCE,  15}, {REDUCE,  15}, {REDUCE,  15}, {REDUCE,  15}, {REDUCE,  15}, {REDUCE,  15}, {REDUCE,  15}, {ERROR ,   0}, {REDUCE,  15}, {ERROR ,   0}, {REDUCE,  15}, {REDUCE,  15}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  15}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca15{				int a15[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  16}, {REDUCE,  16}, {REDUCE,  16}, {REDUCE,  16}, {REDUCE,  16}, {REDUCE,  16}, {REDUCE,  16}, {REDUCE,  16}, {REDUCE,  16}, {REDUCE,  16}, {REDUCE,  16}, {ERROR ,   0}, {REDUCE,  16}, {ERROR ,   0}, {REDUCE,  16}, {REDUCE,  16}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  16}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca16{				int a16[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  17}, {REDUCE,  17}, {REDUCE,  17}, {REDUCE,  17}, {REDUCE,  17}, {REDUCE,  17}, {REDUCE,  17}, {REDUCE,  17}, {REDUCE,  17}, {REDUCE,  17}, {REDUCE,  17}, {ERROR ,   0}, {REDUCE,  17}, {ERROR ,   0}, {REDUCE,  17}, {REDUCE,  17}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  17}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca17{				int a17[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  18}, {REDUCE,  18}, {REDUCE,  18}, {REDUCE,  18}, {REDUCE,  18}, {REDUCE,  18}, {REDUCE,  18}, {REDUCE,  18}, {REDUCE,  18}, {REDUCE,  18}, {REDUCE,  18}, {ERROR ,   0}, {REDUCE,  18}, {ERROR ,   0}, {REDUCE,  18}, {REDUCE,  18}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  18}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca18{				int a18[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  19}, {REDUCE,  19}, {REDUCE,  19}, {REDUCE,  19}, {REDUCE,  19}, {REDUCE,  19}, {REDUCE,  19}, {REDUCE,  19}, {REDUCE,  19}, {REDUCE,  19}, {REDUCE,  19}, {ERROR ,   0}, {REDUCE,  19}, {ERROR ,   0}, {REDUCE,  19}, {REDUCE,  19}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  19}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca19{				int a19[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  20}, {REDUCE,  20}, {REDUCE,  20}, {REDUCE,  20}, {REDUCE,  20}, {REDUCE,  20}, {REDUCE,  20}, {REDUCE,  20}, {REDUCE,  20}, {REDUCE,  20}, {REDUCE,  20}, {ERROR ,   0}, {REDUCE,  20}, {ERROR ,   0}, {REDUCE,  20}, {REDUCE,  20}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  20}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca20{				int a20[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,   7}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  35}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca21{				int a21[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  36}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca22{				int a22[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  37}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca23{				int a23[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  40}, {SHIFT ,  41}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  38}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  39}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca24{				int a24[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  42}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca25{				int a25[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  43}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca26{				int a26[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  44}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca27{				int a27[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  45}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca28{				int a28[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  46}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca29{				int a29[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  47}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca30{				int a30[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  39}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca31{				int a31[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  40}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca32{				int a32[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  41}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca33{				int a33[][] = { {REDUCE,   6}, {ERROR ,   0}, {REDUCE,   6}, {REDUCE,   6}, {REDUCE,   6}, {REDUCE,   6}, {REDUCE,   6}, {REDUCE,   6}, {REDUCE,   6}, {REDUCE,   6}, {REDUCE,   6}, {REDUCE,   6}, {REDUCE,   6}, {ERROR ,   0}, {REDUCE,   6}, {REDUCE,   6}, {REDUCE,   6}, {REDUCE,   6}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,   6}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca34{				int a34[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,   9}, {ERROR ,   0}, {REDUCE,   9}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,   9}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca35{				int a35[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  27}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  48}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca36{				int a36[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  50}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  40}, {SHIFT ,  41}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  49}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  51}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca37{				int a37[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  52}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca38{				int a38[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  49}, {REDUCE,  49}, {REDUCE,  49}, {REDUCE,  49}, {REDUCE,  49}, {REDUCE,  49}, {REDUCE,  49}, {REDUCE,  49}, {REDUCE,  49}, {REDUCE,  49}, {REDUCE,  49}, {ERROR ,   0}, {REDUCE,  49}, {ERROR ,   0}, {REDUCE,  49}, {REDUCE,  49}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  49}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca39{				int a39[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  28}, {REDUCE,  28}, {REDUCE,  28}, {REDUCE,  28}, {REDUCE,  28}, {REDUCE,  28}, {REDUCE,  28}, {REDUCE,  28}, {REDUCE,  28}, {REDUCE,  28}, {REDUCE,  28}, {ERROR ,   0}, {REDUCE,  28}, {ERROR ,   0}, {REDUCE,  28}, {REDUCE,  28}, {ERROR ,   0}, {SHIFT ,  61}, {SHIFT ,  62}, {REDUCE,  28}, {SHIFT ,  55}, {ERROR ,   0}, {SHIFT ,  59}, {SHIFT ,  58}, {SHIFT ,  56}, {ERROR ,   0}, {SHIFT ,  57}, {SHIFT ,  63}, {SHIFT ,  64}, {ERROR ,   0}, {SHIFT ,  60}, {ERROR ,   0}, {REDUCE,  28}, {ERROR ,   0}, {REDUCE,  28}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  53}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  54}, {ERROR ,   0} };
    	};
    	
    	public class ca40{				int a40[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,   7}, {REDUCE,   7}, {REDUCE,   7}, {REDUCE,   7}, {REDUCE,   7}, {REDUCE,   7}, {REDUCE,   7}, {REDUCE,   7}, {REDUCE,   7}, {REDUCE,   7}, {REDUCE,   7}, {ERROR ,   0}, {REDUCE,   7}, {ERROR ,   0}, {REDUCE,   7}, {REDUCE,   7}, {ERROR ,   0}, {REDUCE,   7}, {REDUCE,   7}, {REDUCE,   7}, {REDUCE,   7}, {ERROR ,   0}, {REDUCE,   7}, {REDUCE,   7}, {REDUCE,   7}, {ERROR ,   0}, {REDUCE,   7}, {REDUCE,   7}, {REDUCE,   7}, {ERROR ,   0}, {REDUCE,   7}, {ERROR ,   0}, {REDUCE,   7}, {ERROR ,   0}, {REDUCE,   7}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca41{				int a41[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,   8}, {REDUCE,   8}, {REDUCE,   8}, {REDUCE,   8}, {REDUCE,   8}, {REDUCE,   8}, {REDUCE,   8}, {REDUCE,   8}, {REDUCE,   8}, {REDUCE,   8}, {REDUCE,   8}, {ERROR ,   0}, {REDUCE,   8}, {ERROR ,   0}, {REDUCE,   8}, {REDUCE,   8}, {ERROR ,   0}, {REDUCE,   8}, {REDUCE,   8}, {REDUCE,   8}, {REDUCE,   8}, {ERROR ,   0}, {REDUCE,   8}, {REDUCE,   8}, {REDUCE,   8}, {ERROR ,   0}, {REDUCE,   8}, {REDUCE,   8}, {REDUCE,   8}, {ERROR ,   0}, {REDUCE,   8}, {ERROR ,   0}, {REDUCE,   8}, {ERROR ,   0}, {REDUCE,   8}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca42{				int a42[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  22}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  66}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  65}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca43{				int a43[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  40}, {SHIFT ,  41}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  67}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  39}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca44{				int a44[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  40}, {SHIFT ,  41}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  68}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca45{				int a45[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  40}, {SHIFT ,  41}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  69}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  39}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca46{				int a46[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  70}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca47{				int a47[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  40}, {SHIFT ,  41}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  71}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  39}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca48{				int a48[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  24}, {REDUCE,  24}, {REDUCE,  24}, {REDUCE,  24}, {REDUCE,  24}, {REDUCE,  24}, {REDUCE,  24}, {REDUCE,  24}, {REDUCE,  24}, {REDUCE,  24}, {REDUCE,  24}, {ERROR ,   0}, {REDUCE,  24}, {ERROR ,   0}, {REDUCE,  24}, {REDUCE,  24}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  24}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca49{				int a49[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  72}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca50{				int a50[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  47}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  74}, {SHIFT ,  75}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  73}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca51{				int a51[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  44}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca52{				int a52[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  76}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca53{				int a53[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  26}, {REDUCE,  26}, {REDUCE,  26}, {REDUCE,  26}, {REDUCE,  26}, {REDUCE,  26}, {REDUCE,  26}, {REDUCE,  26}, {REDUCE,  26}, {REDUCE,  26}, {REDUCE,  26}, {ERROR ,   0}, {REDUCE,  26}, {ERROR ,   0}, {REDUCE,  26}, {REDUCE,  26}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  26}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  26}, {ERROR ,   0}, {REDUCE,  26}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca54{				int a54[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  40}, {SHIFT ,  41}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  77}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca55{				int a55[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  29}, {REDUCE,  29}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca56{				int a56[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  30}, {REDUCE,  30}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca57{				int a57[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  31}, {REDUCE,  31}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca58{				int a58[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  32}, {REDUCE,  32}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca59{				int a59[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  33}, {REDUCE,  33}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca60{				int a60[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  34}, {REDUCE,  34}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca61{				int a61[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  35}, {REDUCE,  35}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca62{				int a62[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  36}, {REDUCE,  36}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca63{				int a63[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  37}, {REDUCE,  37}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca64{				int a64[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  38}, {REDUCE,  38}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca65{				int a65[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  78}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca66{				int a66[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  40}, {SHIFT ,  41}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  79}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  39}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca67{				int a67[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  80}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca68{				int a68[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  81}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca69{				int a69[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  82}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca70{				int a70[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  83}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca71{				int a71[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  84}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca72{				int a72[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  85}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca73{				int a73[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  86}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca74{				int a74[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  47}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  74}, {SHIFT ,  75}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  87}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca75{				int a75[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  47}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  74}, {SHIFT ,  75}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  88}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca76{				int a76[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  89}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca77{				int a77[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  27}, {REDUCE,  27}, {REDUCE,  27}, {REDUCE,  27}, {REDUCE,  27}, {REDUCE,  27}, {REDUCE,  27}, {REDUCE,  27}, {REDUCE,  27}, {REDUCE,  27}, {REDUCE,  27}, {ERROR ,   0}, {REDUCE,  27}, {ERROR ,   0}, {REDUCE,  27}, {REDUCE,  27}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  27}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  27}, {ERROR ,   0}, {REDUCE,  27}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca78{				int a78[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  50}, {REDUCE,  50}, {REDUCE,  50}, {REDUCE,  50}, {REDUCE,  50}, {REDUCE,  50}, {REDUCE,  50}, {REDUCE,  50}, {REDUCE,  50}, {REDUCE,  50}, {REDUCE,  50}, {ERROR ,   0}, {REDUCE,  50}, {ERROR ,   0}, {REDUCE,  50}, {REDUCE,  50}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  50}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca79{				int a79[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  21}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca80{				int a80[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,   7}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  90}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca81{				int a81[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  91}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca82{				int a82[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,   7}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  92}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca83{				int a83[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,   3}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  94}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,   3}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  93}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca84{				int a84[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  23}, {REDUCE,  23}, {REDUCE,  23}, {REDUCE,  23}, {REDUCE,  23}, {REDUCE,  23}, {REDUCE,  23}, {REDUCE,  23}, {REDUCE,  23}, {REDUCE,  23}, {REDUCE,  23}, {ERROR ,   0}, {REDUCE,  23}, {ERROR ,   0}, {REDUCE,  23}, {REDUCE,  23}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  23}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca85{				int a85[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  42}, {REDUCE,  42}, {REDUCE,  42}, {REDUCE,  42}, {REDUCE,  42}, {REDUCE,  42}, {REDUCE,  42}, {REDUCE,  42}, {REDUCE,  42}, {REDUCE,  42}, {REDUCE,  42}, {ERROR ,   0}, {REDUCE,  42}, {ERROR ,   0}, {REDUCE,  42}, {REDUCE,  42}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  42}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca86{				int a86[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  43}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca87{				int a87[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  45}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca88{				int a88[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  46}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca89{				int a89[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  48}, {REDUCE,  48}, {REDUCE,  48}, {REDUCE,  48}, {REDUCE,  48}, {REDUCE,  48}, {REDUCE,  48}, {REDUCE,  48}, {REDUCE,  48}, {REDUCE,  48}, {REDUCE,  48}, {ERROR ,   0}, {REDUCE,  48}, {ERROR ,   0}, {REDUCE,  48}, {REDUCE,  48}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  48}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca90{				int a90[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  53}, {REDUCE,  53}, {REDUCE,  53}, {REDUCE,  53}, {REDUCE,  53}, {REDUCE,  53}, {REDUCE,  53}, {REDUCE,  53}, {REDUCE,  53}, {REDUCE,  53}, {REDUCE,  53}, {ERROR ,   0}, {REDUCE,  53}, {SHIFT ,  96}, {REDUCE,  53}, {REDUCE,  53}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  53}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  95}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca91{				int a91[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  98}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  56}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  97}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca92{				int a92[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  25}, {REDUCE,  25}, {REDUCE,  25}, {REDUCE,  25}, {REDUCE,  25}, {REDUCE,  25}, {REDUCE,  25}, {REDUCE,  25}, {REDUCE,  25}, {REDUCE,  25}, {REDUCE,  25}, {ERROR ,   0}, {REDUCE,  25}, {ERROR ,   0}, {REDUCE,  25}, {REDUCE,  25}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  25}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca93{				int a93[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 100}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,   5}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  99}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca94{				int a94[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 101}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca95{				int a95[][] = { {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  51}, {REDUCE,  51}, {REDUCE,  51}, {REDUCE,  51}, {REDUCE,  51}, {REDUCE,  51}, {REDUCE,  51}, {REDUCE,  51}, {REDUCE,  51}, {REDUCE,  51}, {REDUCE,  51}, {ERROR ,   0}, {REDUCE,  51}, {ERROR ,   0}, {REDUCE,  51}, {REDUCE,  51}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  51}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca96{				int a96[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,   7}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO , 102}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca97{				int a97[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 103}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca98{				int a98[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 104}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca99{				int a99[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 105}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca100{				int a100[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 106}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca101{				int a101[][] = { {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 107}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca102{				int a102[][] ={ {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  52}, {REDUCE,  52}, {REDUCE,  52}, {REDUCE,  52}, {REDUCE,  52}, {REDUCE,  52}, {REDUCE,  52}, {REDUCE,  52}, {REDUCE,  52}, {REDUCE,  52}, {REDUCE,  52}, {ERROR ,   0}, {REDUCE,  52}, {ERROR ,   0}, {REDUCE,  52}, {REDUCE,  52}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  52}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca103{				int a103[][] ={ {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  54}, {REDUCE,  54}, {REDUCE,  54}, {REDUCE,  54}, {REDUCE,  54}, {REDUCE,  54}, {REDUCE,  54}, {REDUCE,  54}, {REDUCE,  54}, {REDUCE,  54}, {REDUCE,  54}, {ERROR ,   0}, {REDUCE,  54}, {ERROR ,   0}, {REDUCE,  54}, {REDUCE,  54}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  54}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca104{				int a104[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  40}, {SHIFT ,  41}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO , 108}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca105{				int a105[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,   7}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO , 109}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca106{				int a106[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,   4}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca107{				int a107[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 110}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca108{				int a108[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 111}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca109{				int a109[][] ={ {ERROR ,   0}, {ERROR ,   0}, {REDUCE,   1}, {REDUCE,   1}, {REDUCE,   1}, {REDUCE,   1}, {REDUCE,   1}, {REDUCE,   1}, {REDUCE,   1}, {REDUCE,   1}, {REDUCE,   1}, {REDUCE,   1}, {REDUCE,   1}, {ERROR ,   0}, {REDUCE,   1}, {ERROR ,   0}, {REDUCE,   1}, {REDUCE,   1}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,   1}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca110{				int a110[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 112}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca111{				int a111[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 113}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca112{				int a112[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 114}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca113{				int a113[][] ={ {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  32}, {SHIFT ,  28}, {SHIFT ,  31}, {SHIFT ,  21}, {SHIFT ,  26}, {REDUCE,  10}, {SHIFT ,  23}, {REDUCE,  10}, {SHIFT ,  22}, {SHIFT ,  27}, {SHIFT ,  20}, {ERROR ,   0}, {SHIFT ,  25}, {ERROR ,   0}, {SHIFT ,  30}, {SHIFT ,  29}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  10}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO , 115}, {GO_TO ,   9}, {ERROR ,   0}, {GO_TO ,  19}, {GO_TO ,  10}, {GO_TO ,  17}, {GO_TO ,  18}, {ERROR ,   0}, {GO_TO ,  11}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  12}, {ERROR ,   0}, {GO_TO ,  13}, {GO_TO ,  15}, {ERROR ,   0}, {GO_TO ,  16}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  14}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO ,  24}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca114{				int a114[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 116}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca115{				int a115[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  58}, {ERROR ,   0}, {SHIFT , 118}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  58}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO , 117}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca116{				int a116[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 119}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca117{				int a117[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT ,  98}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  56}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {GO_TO , 120}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca118{				int a118[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 121}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca119{				int a119[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {SHIFT , 122}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca120{				int a120[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  55}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca121{				int a121[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  57}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,  57}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    	
    	public class ca122{				int a122[][] ={ {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,   2}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {REDUCE,   2}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0}, {ERROR ,   0} };
    	};
    
    
public t(){
	tabela[0] = new ca0().a0;
	tabela[1] = new ca1().a1;
	tabela[2] = new ca2().a2;
	tabela[3] = new ca3().a3;
	tabela[4] = new ca4().a4;
	tabela[5] = new ca5().a5;
	tabela[6] = new ca6().a6;
	tabela[7] = new ca7().a7;
	tabela[8] = new ca8().a8;
	tabela[9] = new ca9().a9;
	tabela[10] = new ca10().a10;
	tabela[11] = new ca11().a11;
	tabela[12] = new ca12().a12;
	tabela[13] = new ca13().a13;
	tabela[14] = new ca14().a14;
	tabela[15] = new ca15().a15;
	tabela[16] = new ca16().a16;
	tabela[17] = new ca17().a17;
	tabela[18] = new ca18().a18;
	tabela[19] = new ca19().a19;
	tabela[20] = new ca20().a20;
	tabela[21] = new ca21().a21;
	tabela[22] = new ca22().a22;
	tabela[23] = new ca23().a23;
	tabela[24] = new ca24().a24;
	tabela[25] = new ca25().a25;
	tabela[26] = new ca26().a26;
	tabela[27] = new ca27().a27;
	tabela[28] = new ca28().a28;
	tabela[29] = new ca29().a29;
	tabela[30] = new ca30().a30;
	tabela[31] = new ca31().a31;
	tabela[32] = new ca32().a32;
	tabela[33] = new ca33().a33;
	tabela[34] = new ca34().a34;
	tabela[35] = new ca35().a35;
	tabela[36] = new ca36().a36;
	tabela[37] = new ca37().a37;
	tabela[38] = new ca38().a38;
	tabela[39] = new ca39().a39;
	tabela[40] = new ca40().a40;
	tabela[41] = new ca41().a41;
	tabela[42] = new ca42().a42;
	tabela[43] = new ca43().a43;
	tabela[44] = new ca44().a44;
	tabela[45] = new ca45().a45;
	tabela[46] = new ca46().a46;
	tabela[47] = new ca47().a47;
	tabela[48] = new ca48().a48;
	tabela[49] = new ca49().a49;
	tabela[50] = new ca50().a50;
	tabela[51] = new ca51().a51;
	tabela[52] = new ca52().a52;
	tabela[53] = new ca53().a53;
	tabela[54] = new ca54().a54;
	tabela[55] = new ca55().a55;
	tabela[56] = new ca56().a56;
	tabela[57] = new ca57().a57;
	tabela[58] = new ca58().a58;
	tabela[59] = new ca59().a59;
	tabela[60] = new ca60().a60;
	tabela[61] = new ca61().a61;
	tabela[62] = new ca62().a62;
	tabela[63] = new ca63().a63;
	tabela[64] = new ca64().a64;
	tabela[65] = new ca65().a65;
	tabela[66] = new ca66().a66;
	tabela[67] = new ca67().a67;
	tabela[68] = new ca68().a68;
	tabela[69] = new ca69().a69;
	tabela[70] = new ca70().a70;
	tabela[71] = new ca71().a71;
	tabela[72] = new ca72().a72;
	tabela[73] = new ca73().a73;
	tabela[74] = new ca74().a74;
	tabela[75] = new ca75().a75;
	tabela[76] = new ca76().a76;
	tabela[77] = new ca77().a77;
	tabela[78] = new ca78().a78;
	tabela[79] = new ca79().a79;
	tabela[80] = new ca80().a80;
	tabela[81] = new ca81().a81;
	tabela[82] = new ca82().a82;
	tabela[83] = new ca83().a83;
	tabela[84] = new ca84().a84;
	tabela[85] = new ca85().a85;
	tabela[86] = new ca86().a86;
	tabela[87] = new ca87().a87;
	tabela[88] = new ca88().a88;
	tabela[89] = new ca89().a89;
	tabela[90] = new ca90().a90;
	tabela[91] = new ca91().a91;
	tabela[92] = new ca92().a92;
	tabela[93] = new ca93().a93;
	tabela[94] = new ca94().a94;
	tabela[95] = new ca95().a95;
	tabela[96] = new ca96().a96;
	tabela[97] = new ca97().a97;
	tabela[98] = new ca98().a98;
	tabela[99] = new ca99().a99;
	tabela[100] = new ca100().a100;
	tabela[101] = new ca101().a101;
	tabela[102] = new ca102().a102;
	tabela[103] = new ca103().a103;
	tabela[104] = new ca104().a104;
	tabela[105] = new ca105().a105;
	tabela[106] = new ca106().a106;
	tabela[107] = new ca107().a107;
	tabela[108] = new ca108().a108;
	tabela[109] = new ca109().a109;
	tabela[110] = new ca110().a110;
	tabela[111] = new ca111().a111;
	tabela[112] = new ca112().a112;
	tabela[113] = new ca113().a113;
	tabela[114] = new ca114().a114;
	tabela[115] = new ca115().a115;
	tabela[116] = new ca116().a116;
	tabela[117] = new ca117().a117;
	tabela[118] = new ca118().a118;
	tabela[119] = new ca119().a119;
	tabela[120] = new ca120().a120;
	tabela[121] = new ca121().a121;
	tabela[122] = new ca122().a122;
}}

    int[][] PRODUCTIONS =
    {
        { 39, 5 },
        { 46, 8 },
        { 47, 9 },
        { 47, 0 },
        { 52, 2 },
        { 52, 0 },
        { 62, 3 },
        { 64, 1 },
        { 64, 1 },
        { 40, 2 },
        { 40, 0 },
        { 41, 1 },
        { 41, 1 },
        { 41, 1 },
        { 41, 1 },
        { 41, 1 },
        { 41, 1 },
        { 41, 1 },
        { 41, 1 },
        { 41, 1 },
        { 41, 1 },
        { 42, 2 },
        { 42, 0 },
        { 43, 4 },
        { 44, 3 },
        { 45, 5 },
        { 60, 2 },
        { 61, 2 },
        { 61, 0 },
        { 65, 1 },
        { 65, 1 },
        { 65, 1 },
        { 65, 1 },
        { 65, 1 },
        { 65, 1 },
        { 65, 1 },
        { 65, 1 },
        { 65, 1 },
        { 65, 1 },
        { 63, 1 },
        { 63, 1 },
        { 63, 1 },
        { 48, 5 },
        { 49, 3 },
        { 49, 1 },
        { 50, 2 },
        { 50, 2 },
        { 50, 0 },
        { 51, 5 },
        { 53, 2 },
        { 59, 4 },
        { 54, 6 },
        { 55, 2 },
        { 55, 0 },
        { 56, 7 },
        { 57, 8 },
        { 57, 0 },
        { 58, 2 },
        { 58, 0 }
    };

    String[] PARSER_ERROR =
    {
        "Erro estado 0",
        "Erro estado 1",
        "Erro estado 2",
        "Erro estado 3",
        "Erro estado 4",
        "Erro estado 5",
        "Erro estado 6",
        "Erro estado 7",
        "Erro estado 8",
        "Erro estado 9",
        "Erro estado 10",
        "Erro estado 11",
        "Erro estado 12",
        "Erro estado 13",
        "Erro estado 14",
        "Erro estado 15",
        "Erro estado 16",
        "Erro estado 17",
        "Erro estado 18",
        "Erro estado 19",
        "Erro estado 20",
        "Erro estado 21",
        "Erro estado 22",
        "Erro estado 23",
        "Erro estado 24",
        "Erro estado 25",
        "Erro estado 26",
        "Erro estado 27",
        "Erro estado 28",
        "Erro estado 29",
        "Erro estado 30",
        "Erro estado 31",
        "Erro estado 32",
        "Erro estado 33",
        "Erro estado 34",
        "Erro estado 35",
        "Erro estado 36",
        "Erro estado 37",
        "Erro estado 38",
        "Erro estado 39",
        "Erro estado 40",
        "Erro estado 41",
        "Erro estado 42",
        "Erro estado 43",
        "Erro estado 44",
        "Erro estado 45",
        "Erro estado 46",
        "Erro estado 47",
        "Erro estado 48",
        "Erro estado 49",
        "Erro estado 50",
        "Erro estado 51",
        "Erro estado 52",
        "Erro estado 53",
        "Erro estado 54",
        "Erro estado 55",
        "Erro estado 56",
        "Erro estado 57",
        "Erro estado 58",
        "Erro estado 59",
        "Erro estado 60",
        "Erro estado 61",
        "Erro estado 62",
        "Erro estado 63",
        "Erro estado 64",
        "Erro estado 65",
        "Erro estado 66",
        "Erro estado 67",
        "Erro estado 68",
        "Erro estado 69",
        "Erro estado 70",
        "Erro estado 71",
        "Erro estado 72",
        "Erro estado 73",
        "Erro estado 74",
        "Erro estado 75",
        "Erro estado 76",
        "Erro estado 77",
        "Erro estado 78",
        "Erro estado 79",
        "Erro estado 80",
        "Erro estado 81",
        "Erro estado 82",
        "Erro estado 83",
        "Erro estado 84",
        "Erro estado 85",
        "Erro estado 86",
        "Erro estado 87",
        "Erro estado 88",
        "Erro estado 89",
        "Erro estado 90",
        "Erro estado 91",
        "Erro estado 92",
        "Erro estado 93",
        "Erro estado 94",
        "Erro estado 95",
        "Erro estado 96",
        "Erro estado 97",
        "Erro estado 98",
        "Erro estado 99",
        "Erro estado 100",
        "Erro estado 101",
        "Erro estado 102",
        "Erro estado 103",
        "Erro estado 104",
        "Erro estado 105",
        "Erro estado 106",
        "Erro estado 107",
        "Erro estado 108",
        "Erro estado 109",
        "Erro estado 110",
        "Erro estado 111",
        "Erro estado 112",
        "Erro estado 113",
        "Erro estado 114",
        "Erro estado 115",
        "Erro estado 116",
        "Erro estado 117",
        "Erro estado 118",
        "Erro estado 119",
        "Erro estado 120",
        "Erro estado 121",
        "Erro estado 122"
    };
}

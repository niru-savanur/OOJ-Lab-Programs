class CmdD{
    public static void main(String ss[]){
        double[] ssa = new double[ss.length];
        for(int i = 0;i<ss.length;i++){
            ssa[i] = Double.parseDouble(ss[i]);
        }
        for(int i=0;i<ss.length;i++){
            for(int j=i;j<ssa.length;j++){
                if(ssa[i]>ssa[j]){
                    double temp = ssa[i];
                    ssa[i] = ssa[j];
                    ssa[j] = temp;
                }
                
            }
        }

        for(int i=0;i<ss.length;i++){
          System.out.println(ssa[i] + " ");

        }


    }
}
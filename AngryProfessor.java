 public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
        Collections.sort(a);
        int negcount=0;
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)<=0)
            {huhu
                negcount++;
            }
        }
        if(negcount>=k)
        {
            return "NO";
        }
        else{
            return "YES";
        }
    }

}

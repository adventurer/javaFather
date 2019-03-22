package fuck;

class main {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.Sum(2, 3).Sum(2).Sum(2, 3);
    }
}

class Sum {
    public int total;

    public Sum Sum(int... x) {
        // Sum x = new Sum(x);
        for (int v : x) {
            this.total += v;

        }
        System.out.println(this.total);
        return this;
    }
}

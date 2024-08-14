for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n - 1) || (i == n / 2) || (j == 0 || j == n - 1) && i != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
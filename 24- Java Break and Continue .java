//Java Break

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);         //output 0,1,2,3
}   

//Java Continue

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);         //output 4 without all
}

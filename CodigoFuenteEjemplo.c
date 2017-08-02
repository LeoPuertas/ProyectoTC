int _x = 0;

double exec (double);
double exec2 (double);

double exec (double valor) {
    int i = 10;

    while ((i >= 5) && (valor > 3.4))
        valor -= _x - i;

    return valor;
}
   
int main () {
    double y = 1, z = 3.5;

    for (_x = 5; _x < 10; _x = _x + 1)
        y = exec(y) + exec(z);

    if (y < 100) {
        y = y / 2;
        z = y - 5.5;
    }
    else
        z = y + 5.5;
    x = ( 6 + y ) * 6 + ( 7 * y );
    x = ( 6 + y + c );
    x = 6 * (x * 3 + 4);
    x = 6 * (x + 2);
    return 0;
}

     

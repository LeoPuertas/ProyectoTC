int _numero1 = 10, _numero2 = _numero1;

int _numero3 = _numero1;

float calcular( double _d, int _a )
{
    int variableLocal = 2;
    
    if( 1 > (2*3) )
    {
        _a = 3;
    }
    
    _d = (_numero1 * 5 ) / _a;
    
    if( _d > 3 )
    {
        int variableLocal2 = 2;
        
        return _d * _a;
    }
    else
    {
        return ( _d * 5 ) / 6 - _d + calcular( _numero1, _a );
    }
}

int main()
{
    int _numero4 = calcular( _numero1, _numero2 );
    
    int j;
    
    for( j = 0, _numero4 = j; j < _numero4; j += ( _numero2 * 3 ) )
    {
        _numero4++;
        
        if( j < _numero3 )
        {
            return 0;
        }
    }
    
    return _numero4;
} 

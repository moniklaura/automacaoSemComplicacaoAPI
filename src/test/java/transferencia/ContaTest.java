package transferencia;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ContaTest {

    Cliente mariaLiz;
    Cliente eduardoLuz;
    Conta contaMariaLiz;
    Conta contaEduardoLuz;

    @BeforeEach
    void setUp() {
        mariaLiz = new Cliente("Maria Liz", "00123456789", "1111111");
        eduardoLuz = new Cliente("Eduardo Luz", "9876543200", "232323");

        contaMariaLiz = new Conta("0025", "2254-0", 2500.00, mariaLiz);
        contaEduardoLuz = new Conta("0026","2251-0",3500.00, eduardoLuz);

    }
 //Validações Cliente
    @Test
    public void realizarTransacao(){
        contaMariaLiz.realizarTransferencia(1000.00, contaEduardoLuz);
        assertEquals(1500.00,contaMariaLiz.getSaldo());
        assertEquals(4500.00, contaEduardoLuz.getSaldo());
    }
    @Test
    public void validarTransferenciaInvalida(){
        boolean resultado = contaMariaLiz.realizarTransferencia(3500.00, contaEduardoLuz);
        assertFalse(resultado);

    }
    @Test
    public void validarNomeMariaLiz(){
        String nome = mariaLiz.getNome();
        assertEquals(nome, "Maria Liz");
    }
    @Test
    public void validarCpfMariaLiz() {
        String cpf = mariaLiz.getCpf();
        assertEquals(cpf, "00123456789");
    }
    @Test
    public void validarRgMarializ(){
        String Rg = mariaLiz.getRg();
        assertEquals(Rg,"1111111");
    }
    @Test
    public void validarNomeEduardoLuz(){
        String nome = eduardoLuz.getNome();
        assertEquals(nome,"Eduardo Luz");
    }
    @Test
    public void validarCpfEduardoLuz(){
        String cpf = eduardoLuz.getCpf();
        assertEquals(cpf,"9876543200");
    }
    @Test
    public void validarRgEduardoLuz(){
        String rg = eduardoLuz.getRg();
        assertEquals(rg,"232323");

    //Validações Contas
    }
    @Test
    public void validarAgenciaMariaLiz(){
        String agencia = contaMariaLiz.getAgencia();
        assertEquals(agencia,"0025");
    }
    @Test
    public void validarContaMariaLiz(){
        String conta = contaMariaLiz.getNumeroConta();
        assertEquals(conta,"2254-0");
    }
    @Test
    public void validarSaldoMariaLiz(){
        double saldo = contaMariaLiz.getSaldo();
        assertEquals(saldo,2500.0);
    }
    @Test
    public void validarAgenciaEduardoLuz(){
        String agencia = contaEduardoLuz.getAgencia();
        assertEquals(agencia,"0026");
    }
    @Test
    public void validarContaEduardoLuz(){
        String conta = contaEduardoLuz.getNumeroConta();
        assertEquals(conta,"2251-0");
    }
    @Test
    public void validarSaldoEduardoLuz(){
        double saldo = contaEduardoLuz.getSaldo();
        assertEquals(saldo, 3500.00);
        
    }


}
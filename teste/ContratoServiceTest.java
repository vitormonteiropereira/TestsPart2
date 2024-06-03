import org.junit.Assert;
import org.junit.Test;


public class ContratoServiceTest {


    @Test
    public void salvar(){
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String teste = service.salvar();
        Assert.assertEquals("Sucesso", teste);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        String teste = service.salvar();
        Assert.assertEquals("Sucesso", teste);
    }


    @Test
    public void buscar(){
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String teste = service.buscar();
        Assert.assertEquals("Sucesso", teste);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        String teste = service.buscar();
        Assert.assertEquals("Sucesso", teste);
    }


    @Test
    public void excluir(){
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String teste = service.excluir();
        Assert.assertEquals("Sucesso", teste);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        String teste = service.excluir();
        Assert.assertEquals("Sucesso", teste);
    }


    @Test
    public void atualizar(){
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String teste = service.atualizar();
        Assert.assertEquals("Sucesso", teste);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        String teste = service.atualizar();
        Assert.assertEquals("Sucesso", teste);
    }






}

public class ContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;

    }

    public String salvar(){
        contratoDao.salvar();
        return "Sucesso";

    }

    public String buscar() {
        contratoDao.buscar();
        return "Sucesso";
    }

    public String excluir() {
        contratoDao.excluir();
        return "Sucesso";
    }

    public String atualizar() {
        contratoDao.atualizar();
        return "Sucesso";
    }
}

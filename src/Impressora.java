public abstract class Impressora {

    private static Imprimivel[] documentos = new Imprimivel[10];

    public static void adicionarDocumento(Imprimivel imprimivel) {
        for(int i= 0; i< documentos.length; i++) {
            if(documentos[i] == null) {
                documentos[i] = imprimivel;
                break;
            }
        }
    }

    public static void imprimirTodos() {
        for(int i = 0; i < documentos.length; i++) {
            if(documentos[i] == null) {
                break;
            } else {
                documentos[i].imprimir();
            }
        }
    }

    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setNome("Contrato 1");
        contrato.setTipo("Tipo X");

        Documento documento = new Documento();
        documento.setNome("Documento 1");
        documento.setTipo("Tipo Y");

        Foto foto = new Foto();
        foto.setNome("Foto 1");
        foto.setTipo("Tipo Z");

        Impressora.adicionarDocumento(contrato);
        Impressora.adicionarDocumento(documento);
        Impressora.adicionarDocumento(foto);

        Impressora.imprimirTodos();
    }

}
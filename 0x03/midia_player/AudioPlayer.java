public class AudioPlayer implements MediaPlayer{
    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo) {
        if (tipoMedia.equals(TipoMedia.MP3)) {
            System.out.printf("Reproduzindo MP3: %s", nomeArquivo);
        } else {
            new MediaPlayerAdapter(tipoMedia).reproduzir(tipoMedia, nomeArquivo);
        }
    }
}
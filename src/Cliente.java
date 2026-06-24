/*
 * Autor: Adrián Pérez Pérez
 * Patrón: Factory Method - Sistema de Notificaciones
 */
public class Cliente {
    private final CreadorNotificacion creador;

    public Cliente(CreadorNotificacion creador) {
        this.creador = creador;
    }

    public void enviarNotificacion(String mensaje) {
        Notificacion notificacion = creador.crearNotificacion();
        notificacion.enviar(mensaje);
    }
}
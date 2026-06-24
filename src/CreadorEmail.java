/*
 * Autor: Adrián Pérez Pérez
 * Patrón: Factory Method - Sistema de Notificaciones
 */
public class CreadorEmail extends CreadorNotificacion {
    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionEmail();
    }
}
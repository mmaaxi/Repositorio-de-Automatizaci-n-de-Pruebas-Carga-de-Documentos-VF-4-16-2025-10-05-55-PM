Feature: Prueba de seguridad: carga por usuario no autenticado

  Scenario: Intentar acceder a la funcionalidad de carga sin estar autenticado
    Given el usuario no está autenticado
    When el usuario intenta acceder a la funcionalidad de carga
    Then el sistema debe redirigir al usuario a la pantalla de inicio de sesión
    And debe mostrar un mensaje de acceso denegado
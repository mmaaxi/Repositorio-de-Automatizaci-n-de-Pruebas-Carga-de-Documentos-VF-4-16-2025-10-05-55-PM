Feature: Prueba de error en carga interrumpida

  Scenario: Manejo de carga interrumpida y reintento
    Given el usuario inicia una carga de documento
    When el usuario interrumpe la conexión durante la carga
    Then el sistema debe cancelar la carga y mostrar un mensaje de error relevante
    When el usuario reintenta la carga del documento
    Then el sistema debe permitir reintentar sin duplicar el registro o corromper los datos
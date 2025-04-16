Feature: Verificar límite de tamaño del documento

  Scenario: Seleccionar un archivo que supere el tamaño máximo permitido
    Given El usuario está en la página de carga de archivos
    When El usuario selecciona un archivo que excede el tamaño máximo permitido
    Then El sistema muestra un mensaje de error indicando que el archivo excede el tamaño permitido
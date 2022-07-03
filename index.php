<!DOCTYPE html>
<html>

<head>
    <title>Qwertious Launcher</title>
</head>

<body>
    <?php
        if ($_GET['run']) {
            exec("/path/to/name.sh");
        }
    ?>
    <a href="?run=true">Click Me!</a>
</body>

</html>
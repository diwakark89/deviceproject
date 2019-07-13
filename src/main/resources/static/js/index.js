$(document).ready(function () {
    $("#map").googleMap({
      zoom: 10, // Initial zoom level (optional)
      coords: [48.895651, 2.290569], // Map center (optional)
      type: "ROADMAP" // Map type (optional)
    });
    $("#sidebar").mCustomScrollbar({
         theme: "minimal"
    });

    $('#sidebarCollapse').on('click', function () {
        $('#sidebar').toggleClass('active');
    });

});
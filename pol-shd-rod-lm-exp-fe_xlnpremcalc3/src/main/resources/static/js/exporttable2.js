/*var table2; 

$(document).ready(function() {
       table2 = $('#example2').DataTable({
    	   
    	   
"order": [[ 0, "asc" ]],
        dom:  "<'row'<'col-sm-6'l><'col-sm-6'f>>" +"<'row'<'col-sm-12'tr>>" +
         "<'row'<'col-sm-6'i><'col-sm-6'p>>",
          responsive:true,
        lengthChange: true,
        buttons: [{
            extend: 'collection',
            text: 'Export',
            buttons: [
              'copy',
              'excel',
              'csv',
              'print',
               'pdf',
            ]
          },


          // 'copy', 'excel', 'pdf', 'colvis'

        ],
"initComplete": function(settings){
            $('#example2 thead th').each(function () {
               var $td = $(this);
		console.log($td[0]);
			if($td=='th.sorting')
                           $td.attr('title', "no sort");
			else
			    $td.attr('title', "sort");
            });

           
        }
      });

      table2.buttons().container()
        .appendTo('.exportbuttons:eq(0)');
      
      

    });
*/